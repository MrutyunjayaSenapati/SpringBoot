package com.ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="ARTIST_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class Artist {
	@Column(name="AID")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer docId;
	@Column(name="ANAME",length=40)
	private String aname;
	@NonNull
	private Double fee;
	

}
