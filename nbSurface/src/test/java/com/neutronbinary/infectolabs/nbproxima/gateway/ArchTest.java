package com.neutronbinary.infectolabs.nbproxima.gateway;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("com.neutronbinary.infectolabs.nbproxima.gateway");

        noClasses()
            .that()
            .resideInAnyPackage("com.neutronbinary.infectolabs.nbproxima.gateway.service..")
            .or()
            .resideInAnyPackage("com.neutronbinary.infectolabs.nbproxima.gateway.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..com.neutronbinary.infectolabs.nbproxima.gateway.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
