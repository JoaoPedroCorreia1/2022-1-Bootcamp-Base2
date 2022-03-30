package com.javaseleniumtemplate.dto;

public class IssueDTO {
    private String _project;

    private String _category;
    private String _reproducibility;
    private String _severity;
    private String _priority;
    private String _selectProfile;

    private String _assignTo;
    private String _summary;
    private String _description;
    private String _stepsToReproduce;
    private String _additionalInformation;

    private String _chosenFile;

    private String _viewStatus;
    private String _reportStay;
    
    public IssueDTO(
            String project,

            String category,
            String reproducibility,
            String severity,
            String priority,
            String selectProfile,

            String assignTo,
            String summary,
            String description,
            String stepsToReproduce,
            String additionalInformation,

            String chosenFile,

            String viewStatus,
            String reportStay) {
        this._project = project;

        this._category = category;
        this._reproducibility = reproducibility;
        this._severity = severity;
        this._priority = priority;
        this._selectProfile = selectProfile;

        this._assignTo = assignTo;
        this._summary = summary;
        this._description = description;
        this._stepsToReproduce = stepsToReproduce;
        this._additionalInformation = additionalInformation;

        this._chosenFile = chosenFile;

        this._viewStatus = viewStatus;
        this._reportStay = reportStay;
    }

    public String getProject() {
        return _project;
    }

    public void setProject(String _project) {
        this._project = _project;
    }

    public String getCategory() {
        return _category;
    }

    public void setCategory(String _category) {
        this._category = _category;
    }

    public String getReproducibility() {
        return _reproducibility;
    }

    public void setReproducibility(String _reproducibility) {
        this._reproducibility = _reproducibility;
    }

    public String getSeverity() {
        return _severity;
    }

    public void setSeverity(String _severity) {
        this._severity = _severity;
    }

    public String getPriority() {
        return _priority;
    }

    public void setPriority(String _priority) {
        this._priority = _priority;
    }

    public String getSelectProfile() {
        return _selectProfile;
    }

    public void setSelectProfile(String _selectProfile) {
        this._selectProfile = _selectProfile;
    }

    public String getAssignTo() {
        return _assignTo;
    }

    public void setAssignTo(String _assignTo) {
        this._assignTo = _assignTo;
    }

    public String getSummary() {
        return _summary;
    }

    public void setSummary(String _summary) {
        this._summary = _summary;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public String getStepsToReproduce() {
        return _stepsToReproduce;
    }

    public void setStepsToReproduce(String _stepsToReproduce) {
        this._stepsToReproduce = _stepsToReproduce;
    }

    public String getAdditionalInformation() {
        return _additionalInformation;
    }

    public void setAdditionalInformation(String _additionalInformation) {
        this._additionalInformation = _additionalInformation;
    }

    public String getChosenFile() {
        return _chosenFile;
    }

    public void setChosenFile(String _chosenFile) {
        this._chosenFile = _chosenFile;
    }

    public String getViewStatus() {
        return _viewStatus;
    }

    public void setViewStatus(String _viewStatus) {
        this._viewStatus = _viewStatus;
    }

    public String getReportStay() {
        return _reportStay;
    }

    public void setReportStay(String _reportStay) {
        this._reportStay = _reportStay;
    }
}
