pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MVI_LoginApp"
include(":app")
 
include("core")
include(":core:uicomponents")
include(":core:navigation")
include(":core:utils")
include(":feature:loginscreen")
include(":feature:registerscreen")
include(":feature:splashscreen")
include(":feature:onboardingscreen")
include(":feature:loginscreen:api")
include(":feature:loginscreen:impl")
include(":onboardingscreen:api")
include(":onboardingscreen:impl")
