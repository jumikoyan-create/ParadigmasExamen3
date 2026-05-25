package co.edu.poli.Examen3.controlador;

import javafx.fxml.FXML;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import co.edu.poli.Examen3.modelo.Tipodeexamen;
import co.edu.poli.Examen3.modelo.Examendeorina;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.*;

public class PrimaryController {

	@FXML
	private TextField txtCodigoExamen;
	@FXML
	private TextField txtNombrePaciente;
	@FXML
	private TextField txtCosto;
	@FXML
	private ComboBox<String> cmbNivelGlucosa;
	@FXML
	private TextField txtPh;
	@FXML
	private TextArea txtAreaResultados;

	@FXML
	public void initialize() {
	}

	@FXML
	private void handleGuardar() {
	}

	@FXML
	private void handleLimpiar() {
	}

	@FXML
	private void handleSerializar() {
	}

	@FXML
	private void handleDeserializar() {
	}

	@FXML
	private void handleListar() {
	}
}
