pluginManagement {
    repositories {
        maven("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
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
//        maven("https://maven.aliyun.com/nexus/content/groups/public/")
//        maven("https://maven.aliyun.com/nexus/content/repositories/jcenter")
//        maven("https://maven.aliyun.com/nexus/content/repositories/google")
//        maven("https://maven.aliyun.com/nexus/content/repositories/gradle-plugin")
//        maven("https://jitpack.io")
        google()
        mavenCentral()
    }
}

rootProject.name = "ComposeDemos"
include(":app")
