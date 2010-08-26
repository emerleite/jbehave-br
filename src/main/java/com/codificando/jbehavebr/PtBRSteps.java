package com.codificando.jbehavebr;

import java.util.Locale;

import org.jbehave.scenario.definition.KeyWords;
import org.jbehave.scenario.i18n.I18nKeyWords;
import org.jbehave.scenario.i18n.StringEncoder;
import org.jbehave.scenario.steps.Steps;
import org.jbehave.scenario.steps.StepsConfiguration;

public class PtBRSteps extends Steps {
	
	public PtBRSteps () {
		super(new StepsConfiguration(keywordsFor(new Locale("pt"), Steps.class.getClassLoader())));
	}
	
	protected static KeyWords keywordsFor(Locale locale, ClassLoader classLoader) {
        return new I18nKeyWords(locale, new StringEncoder(), "com/codificando/jbehavebr/keywords", classLoader);
    }	
}