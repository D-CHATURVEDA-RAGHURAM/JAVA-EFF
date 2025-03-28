package com.effigo.shared.dto.external.v7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "ActionExpression")
public class ExternalActionExpressionAttributeDtoV7 {
	@XmlAttribute(name ="actionCode ")
	private String actionCode ;
}
