module DEIN23_24EjercicioO {
	requires javafx.controls;
	requires java.desktop;
	requires javafx.web;
	requires javafx.fxml;
	requires javafx.media;

	opens com.dein.productolabelwidget to javafx.graphics, javafx.fxml;
}