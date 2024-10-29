package com.example.flavors_demo

import io.flutter.BuildConfig
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodCall
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant
//import com.example.flavors_demo.BuildConfig

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        MethodChannel(flutterEngine.dartExecutor.binaryMessenger, "flavor")
            .setMethodCallHandler { call: MethodCall?, result: MethodChannel.Result ->
//                result.success(BuildConfig.FLAVOR)
                result.success("FLAVOR")
            }
    }
}
