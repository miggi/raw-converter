import java.io.Serializable;

public class Type implements Serializable {
    String accountType;
    String signalServiceName;
    String urlValidationRegex;
    Boolean activeFlag = true;
    Boolean advocateDisplay = false;
    Boolean employeeDisplay = false;
    String url;
    Boolean collectionEnabled = false;
    String collectorsServiceBeanName;
    Integer displayOrder;

    public String toString() {
        return "${accountType}";
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getSignalServiceName() {
        return signalServiceName;
    }

    public void setSignalServiceName(String signalServiceName) {
        this.signalServiceName = signalServiceName;
    }

    public String getUrlValidationRegex() {
        return urlValidationRegex;
    }

    public void setUrlValidationRegex(String urlValidationRegex) {
        this.urlValidationRegex = urlValidationRegex;
    }

    public Boolean getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Boolean getAdvocateDisplay() {
        return advocateDisplay;
    }

    public void setAdvocateDisplay(Boolean advocateDisplay) {
        this.advocateDisplay = advocateDisplay;
    }

    public Boolean getEmployeeDisplay() {
        return employeeDisplay;
    }

    public void setEmployeeDisplay(Boolean employeeDisplay) {
        this.employeeDisplay = employeeDisplay;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getCollectionEnabled() {
        return collectionEnabled;
    }

    public void setCollectionEnabled(Boolean collectionEnabled) {
        this.collectionEnabled = collectionEnabled;
    }

    public String getCollectorsServiceBeanName() {
        return collectorsServiceBeanName;
    }

    public void setCollectorsServiceBeanName(String collectorsServiceBeanName) {
        this.collectorsServiceBeanName = collectorsServiceBeanName;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }
}
