import jenkins.model.*
import org.datadog.jenkins.plugins.datadog.DatadogGlobalConfiguration

def j = Jenkins.getInstance()
def d = j.getDescriptor("org.datadog.jenkins.plugins.datadog.DatadogGlobalConfiguration")

d.setReportWith('DSD')
d.setTargetHost('datadog')
d.setTargetPort(8125)

// If you want to collect logs
d.setTargetLogCollectionPort(8125)
d.setCollectBuildLogs(true)
d.setCollectBuildTraces(true)
d.setEmitConfigChangeEvents(true)
d.setEmitSecurityEvents(true)
d.setEmitSystemEvents(true)

// Save config
d.save()