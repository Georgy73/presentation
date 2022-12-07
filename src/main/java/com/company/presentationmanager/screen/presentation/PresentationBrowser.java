package com.company.presentationmanager.screen.presentation;

import io.jmix.ui.screen.*;
import com.company.presentationmanager.entity.Presentation;

@UiController("Presentation.browser")
@UiDescriptor("presentation-browser.xml")
@LookupComponent("presentationsTable")
public class PresentationBrowser extends StandardLookup<Presentation> {
}