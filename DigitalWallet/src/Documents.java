
public class Documents {
	int docId;
	String docType;
	String credNumber;
	String issueDate;
	String expiryDate;
	
	public Documents() {
	}
	
	public Documents(int docId, String docType, String credNumber, String issueDate, String expiryDate) {
		this.docId = docId;
		this.docType = docType;
		this.credNumber = credNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}
	public int getDocId() {
		return docId;
	}
	public void setDocId(int docId) {
		this.docId = docId;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getCredNumber() {
		return credNumber;
	}
	public void setCredNumber(String credNumber) {
		this.credNumber = credNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
}
