package org.xframium.device.cloud.action;

import java.io.InputStream;
import org.xframium.device.factory.DeviceWebDriver;
import org.xframium.integrations.common.PercentagePoint;
import org.xframium.page.BY;
import org.xframium.page.element.Element;
import org.xframium.reporting.ExecutionContextTest;
import org.xframium.spi.Device;

public interface CloudActionProvider
{
    public boolean startApp( String executionId, String deviceId, String appName, String appIdentifier );
    public boolean popuplateDevice( DeviceWebDriver webDriver, String deviceId, Device device );
    public void enabledLogging( DeviceWebDriver webDriver );
    public void disableLogging( DeviceWebDriver webDriver );
    public String getExecutionId( DeviceWebDriver webDriver );
    public String getCloudPlatformName(Device device);
    public String getCloudBrowserName(String currBrowserName);
    
    public boolean installApplication( String applicationName, DeviceWebDriver webDriver, boolean instrumentApp );
    public boolean uninstallApplication( String applicationName, DeviceWebDriver webDriver );
    public boolean openApplication( String applicationName, DeviceWebDriver webDriver );
    public boolean closeApplication( String applicationName, DeviceWebDriver webDriver );
    public boolean isDescriptorSupported( BY descriptorType );
    
    public String startTimer( DeviceWebDriver webDriver, Element element, ExecutionContextTest executionContext);
    public boolean getSupportedTimers( DeviceWebDriver webDriver, String timerId, ExecutionContextTest executionContext, String type  );
    public void stopTimer( DeviceWebDriver webDriver, String timerId, ExecutionContextTest executionContext );

    public void tap( DeviceWebDriver webDriver, PercentagePoint location, int lengthInMillis );
    public String getLog( DeviceWebDriver webDriver );
    public String getVitals( DeviceWebDriver webDriver );
    
    public InputStream getReport( DeviceWebDriver webDriver, String reportType );
    
}
