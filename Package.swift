// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "NearpayCapacitorPluginExample",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "NearpayCapacitorPluginExample",
            targets: ["NearpayImplementationPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "NearpayImplementationPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/NearpayImplementationPlugin"),
        .testTarget(
            name: "NearpayImplementationPluginTests",
            dependencies: ["NearpayImplementationPlugin"],
            path: "ios/Tests/NearpayImplementationPluginTests")
    ]
)