package server;

public class Header {
	
	private String method;
	private String url;
	private String connection;
	private String cacheControl;
	private String upgradeInsecureRequests;
	private String userAgent;
	private String accept;
	private String acceptEncoding;
	private String acceptLanguage;
	private String cookie;
	private String host;
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String connection) {
		this.connection = connection;
	}
	public String getCacheControl() {
		return cacheControl;
	}
	public void setCacheControl(String cacheControl) {
		this.cacheControl = cacheControl;
	}
	public String getUpgradeInsecureRequests() {
		return upgradeInsecureRequests;
	}
	public void setUpgradeInsecureRequests(String upgradeInsecureRequests) {
		this.upgradeInsecureRequests = upgradeInsecureRequests;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getAcceptEncoding() {
		return acceptEncoding;
	}
	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}
	public String getAcceptLanguage() {
		return acceptLanguage;
	}
	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	
	@Override
	public String toString() {
		return "Header [method=" + method + ", url=" + url + ", connection=" + connection + ", cacheControl=" + cacheControl + ", upgradeInsecureRequests=" + upgradeInsecureRequests + ", userAgent=" + userAgent + ", accept=" + accept + ", acceptEncoding=" + acceptEncoding + ", acceptLanguage="
				+ acceptLanguage + ", cookie=" + cookie + ", host=" + host + "]";
	}
	
	
	
}
