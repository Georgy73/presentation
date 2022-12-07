package com.company.presentationmanager.screen.presentation;

import io.jmix.ui.component.BrowserFrame;
import io.jmix.ui.component.FileStorageResource;
import io.jmix.ui.screen.*;
import com.company.presentationmanager.entity.Presentation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@UiController("Presentation.edit")
@UiDescriptor("presentation-edit.xml")
@EditedEntityContainer("presentationDc")
public class PresentationEdit extends StandardEditor<Presentation> {
    @Autowired
    private BrowserFrame fileLookup;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
        Presentation presentation = getEditedEntity();
        if (Objects.nonNull(presentation.getFileRef())) {
            fileLookup.setSource(FileStorageResource.class)
                    .setFileReference(presentation.getFileRef());
        }
    }
}