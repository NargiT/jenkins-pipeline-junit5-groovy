use events:

```
def cause = currentBuild.rawBuild.getCause(com.cloudbees.jenkins.plugins.pipeline.events.EventTriggerCause)
println cause.event <- json

{
  "artifact" : {
    "name" : "toto"
  },
  "source" : {
    "type" : "JenkinsBuild",
    "buildInfo" : {
      "build" : 13,
      "job" : "publish-event",
      "jenkinsUrl" : "http://localhost:8080/",
      "instanceId" : "e1e75040eb90e444dcbbe759d61225fd"
    }
  }
}
```

