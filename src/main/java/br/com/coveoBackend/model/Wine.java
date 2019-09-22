package br.com.coveoBackend.model;

import java.util.List;

public class Wine {

	private String title;
	private String uri;
	private String printableUri;
	private String clickUri;
	private String uniqueId;
	private String excerpt;
	private String firstSentences;
	private String summary;
	private String flags;
	private boolean hasHtmlVersion;
	private boolean hasMobileHtmlVersion;
	private long score;
	private double percentScore;
	private String rankingInfo;
	private int rating;
	private boolean isTopResult;
	private boolean isRecommendation;
	private boolean isUserActionView;
	private List<String> titleHighlights;
	private List<String> firstSentencesHighlights;
	private List<String> excerptHighlights;
	private List<String> printableUriHighlights;
	private List<String> summaryHighlights;
	private Wine parentResult;
	private List<Wine> childResults;
	private long totalNumberOfChildResults;
	private List<String> absentTerms;
	private Raw raw;
	private String Title;
	private String Uri;
	private String PrintableUri;
	private String ClickUri;
	private String UniqueId;
	private String Excerpt;
	private String FirstSentences;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.Title = title;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
		this.Uri = uri;
	}

	public String getPrintableUri() {
		return printableUri;
	}

	public void setPrintableUri(String printableUri) {
		this.printableUri = printableUri;
		this.PrintableUri = printableUri;
	}

	public String getClickUri() {
		return clickUri;
	}

	public void setClickUri(String clickUri) {
		this.clickUri = clickUri;
		this.ClickUri = clickUri;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
		this.UniqueId = uniqueId;
	}

	public String getExcerpt() {
		return excerpt;
	}

	public void setExcerpt(String excerpt) {
		this.excerpt = excerpt;
		this.Excerpt = excerpt;
	}

	public String getFirstSentences() {
		return firstSentences;
	}

	public void setFirstSentences(String firstSentences) {
		this.firstSentences = firstSentences;
		this.FirstSentences = firstSentences;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getFlags() {
		return flags;
	}

	public void setFlags(String flags) {
		this.flags = flags;
	}

	public boolean isHasHtmlVersion() {
		return hasHtmlVersion;
	}

	public void setHasHtmlVersion(boolean hasHtmlVersion) {
		this.hasHtmlVersion = hasHtmlVersion;
	}

	public boolean isHasMobileHtmlVersion() {
		return hasMobileHtmlVersion;
	}

	public void setHasMobileHtmlVersion(boolean hasMobileHtmlVersion) {
		this.hasMobileHtmlVersion = hasMobileHtmlVersion;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public double getPercentScore() {
		return percentScore;
	}

	public void setPercentScore(double percentScore) {
		this.percentScore = percentScore;
	}

	public String getRankingInfo() {
		return rankingInfo;
	}

	public void setRankingInfo(String rankingInfo) {
		this.rankingInfo = rankingInfo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isTopResult() {
		return isTopResult;
	}

	public void setTopResult(boolean isTopResult) {
		this.isTopResult = isTopResult;
	}

	public boolean isRecommendation() {
		return isRecommendation;
	}

	public void setRecommendation(boolean isRecommendation) {
		this.isRecommendation = isRecommendation;
	}

	public boolean isUserActionView() {
		return isUserActionView;
	}

	public void setUserActionView(boolean isUserActionView) {
		this.isUserActionView = isUserActionView;
	}

	public List<String> getTitleHighlights() {
		return titleHighlights;
	}

	public void setTitleHighlights(List<String> titleHighlights) {
		this.titleHighlights = titleHighlights;
	}

	public List<String> getFirstSentencesHighlights() {
		return firstSentencesHighlights;
	}

	public void setFirstSentencesHighlights(List<String> firstSentencesHighlights) {
		this.firstSentencesHighlights = firstSentencesHighlights;
	}

	public List<String> getExcerptHighlights() {
		return excerptHighlights;
	}

	public void setExcerptHighlights(List<String> excerptHighlights) {
		this.excerptHighlights = excerptHighlights;
	}

	public List<String> getPrintableUriHighlights() {
		return printableUriHighlights;
	}

	public void setPrintableUriHighlights(List<String> printableUriHighlights) {
		this.printableUriHighlights = printableUriHighlights;
	}

	public List<String> getSummaryHighlights() {
		return summaryHighlights;
	}

	public void setSummaryHighlights(List<String> summaryHighlights) {
		this.summaryHighlights = summaryHighlights;
	}

	public Wine getParentResult() {
		return parentResult;
	}

	public void setParentResult(Wine parentResult) {
		this.parentResult = parentResult;
	}

	public List<Wine> getChildResults() {
		return childResults;
	}

	public void setChildResults(List<Wine> childResults) {
		this.childResults = childResults;
	}

	public long getTotalNumberOfChildResults() {
		return totalNumberOfChildResults;
	}

	public void setTotalNumberOfChildResults(long totalNumberOfChildResults) {
		this.totalNumberOfChildResults = totalNumberOfChildResults;
	}

	public List<String> getAbsentTerms() {
		return absentTerms;
	}

	public void setAbsentTerms(List<String> absentTerms) {
		this.absentTerms = absentTerms;
	}

	public Raw getRaw() {
		return raw;
	}

	public void setRaw(Raw raw) {
		this.raw = raw;
	}

}