#!/usr/bin/env groovy

import jenkins.Bar

def call(config) {
    println("foo" + new Bar().getValue())
}