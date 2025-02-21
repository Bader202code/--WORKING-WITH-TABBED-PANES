module AppFrameManagement {
    requires java.desktop; // Required for Swing
    requires ComputingManagement; // Access to Computing
    requires ButtonPanelManagement; // Access to ButtonPanel
    requires FormPanelManagement; // Access to FormPanel
    requires InfoPanelManagement; // Access to InfoPanel
    requires ListPanelManagement; // Access to ListPanel

    exports org.example;  // Expose the org.example package for other modules
}
