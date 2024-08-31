package tester_productprocess_ts.utilities.uiUtilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class PdfReportGenerator {
    private static ExtentReports extent;

    public static void generatePdfReport() throws IOException {
        // 1. ExtentReports Rapor Oluşturma
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        // 2. Raporlama
        ExtentTest test = extent.createTest("Test Case 1", "Test Description");
        test.pass("This is a pass step.");
        test.fail("This is a fail step.");

        extent.flush();

        // 3. HTML Raporunu PDF'ye Dönüştürme
        convertHtmlToPdf("extent-report.html", "extent-report.pdf");
    }

    public static void convertHtmlToPdf(String htmlFilePath, String pdfFilePath) throws IOException {
        // HTML dosyasını oku
        File input = new File(htmlFilePath);
        Document htmlDoc = (Document) Jsoup.parse(input, "UTF-8");

        // PDF dosyası oluşturma
        try (PDDocument pdfDoc = new PDDocument()) {
            PDPage page = new PDPage();
            pdfDoc.addPage(page);

            try (PDPageContentStream contentStream = new PDPageContentStream(pdfDoc, page)) {
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.newLineAtOffset(25, 750);

                // HTML içeriğini PDF'e ekle
                contentStream.showText(htmlDoc.body().text());
                contentStream.endText();
            }

            pdfDoc.save(pdfFilePath);
            System.out.println("PDF başarıyla oluşturuldu: " + pdfFilePath);
        }
    }
}
