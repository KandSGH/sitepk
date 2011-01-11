package com.sitepk.hibernate;

// Generated 2010-12-23 3:02:45 by Hibernate Tools 3.3.0.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * SpSitetags generated by hbm2java
 */
@Entity
@Table(name = "sp_sitetags")
@XmlRootElement(name = "siteTags")
@XmlAccessorType(XmlAccessType.FIELD)
public class SpSitetags implements java.io.Serializable {

	private SpSitetagsId id;
	private SpTags spTags;
	private SpSite spSite;

	public SpSitetags() {
	}

	public SpSitetags(SpSitetagsId id, SpTags spTags, SpSite spSite) {
		this.id = id;
		this.spTags = spTags;
		this.spSite = spSite;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, length = 13)),
			@AttributeOverride(name = "siteid", column = @Column(name = "SITEID", nullable = false, length = 13)) })
	public SpSitetagsId getId() {
		return this.id;
	}

	public void setId(SpSitetagsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TAGNAME", nullable = false)
	public SpTags getSpTags() {
		return this.spTags;
	}

	public void setSpTags(SpTags spTags) {
		this.spTags = spTags;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SITEID", nullable = false, insertable = false, updatable = false)
	public SpSite getSpSite() {
		return this.spSite;
	}

	public void setSpSite(SpSite spSite) {
		this.spSite = spSite;
	}

}
