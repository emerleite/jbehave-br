package com.codificando.jbehavebr;

import org.jbehave.scenario.PropertyBasedConfiguration;
import org.jbehave.scenario.Scenario;
import org.jbehave.scenario.definition.KeyWords;
import org.jbehave.scenario.parser.ClasspathScenarioDefiner;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.ScenarioDefiner;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;

public class PtBRScenario extends Scenario {
	public PtBRScenario() {
		 super(new PropertyBasedConfiguration() {
			 	public ScenarioDefiner forDefiningScenarios() {
	                return new ClasspathScenarioDefiner(
	                    new UnderscoredCamelCaseResolver(".cenario"), 
	                    new PatternScenarioParser(this), Thread.currentThread().getContextClassLoader());
	            }
			 
	            public KeyWords keywords() {
	                return new KeyWords("Cenário", "Dado", "Quando", "Então", "E");
	            }
		 });
	}
}

