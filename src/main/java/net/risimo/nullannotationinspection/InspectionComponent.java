package net.risimo.nullannotationinspection;

import com.intellij.codeInspection.InspectionToolProvider;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * User: rfalke
 * Date: 2012-11-20
 */
public class InspectionComponent implements ApplicationComponent, InspectionToolProvider {
    private static final Class[] INSPECTION_CLASSES = {
            NullAnnotationsInspection.class
    };

    @NonNls
    @NotNull
    public String getComponentName() {
        return "VerifyNullAnnotationExistenceInspection";
    }

    public void initComponent() {
    }

    public void disposeComponent() {
    }

    @NotNull
    public Class[] getInspectionClasses() {
        return INSPECTION_CLASSES;
    }

}
