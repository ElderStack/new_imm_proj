module new_imm_proj {
    requires javafx.controls;
    requires javafx.fxml;

    opens new_imm_proj to javafx.fxml;
    exports new_imm_proj;
}
