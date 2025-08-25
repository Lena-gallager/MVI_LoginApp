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
include(":core:viewModel")
include(":feature:onboardingscreen:api")
include(":feature:onboardingscreen:impl")
include(":feature:registerscreen:api")
include(":feature:registerscreen:impl")
include(":feature:splashscreen:api")
include(":feature:splashscreen:impl")
include(":storage")
include(":storage:api")
include(":storage:impl")
include(":feature:onboardingscreen:data")
include(":feature:loginscreen:data")
include(":feature:loginscreen:domain")
include(":feature:registerscreen:data")
include(":feature:registerscreen:domain")
