package typings.zingchart.es6Mod.zingchart

import typings.zingchart.anon.BorderRadiusBottomLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait refresh extends StObject {
  
  /**
    * Enabling true will allow dynamic value range of the scale pertaining to the values. false (default) | true
    */
  var `adjust-scale`: js.UndefOr[Boolean] = js.undefined
  
  var adjustScale: js.UndefOr[Boolean] = js.undefined
  
  var curtain: js.UndefOr[BorderRadiusBottomLeft] = js.undefined
  
  /**
    * Sets the timeout between two refresh operations. If value is smaller than 50, seconds are assumed, otherwise milliseconds are assu
    * med. 5 | 10 | ...
    */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the max amount of nodes visible in the graph. 5 | 10 | ...
    */
  var `max-ticks`: js.UndefOr[Double] = js.undefined
  
  var maxTicks: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of nodes before starting the feed from 0 again. 500 | 1000 | ...
    */
  var `reset-timeout`: js.UndefOr[Double] = js.undefined
  
  var resetTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines the specific type of feed. http | js | websockets
    */
  var transport: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the type of data refresh, full being the only option at loader's level. "full"
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The url path for the feed. feed() | https://myPhpFunction.php | wss://websockets.zingchart.com:8889
    */
  var url: js.UndefOr[String] = js.undefined
}
object refresh {
  
  inline def apply(): refresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[refresh]
  }
  
  extension [Self <: refresh](x: Self) {
    
    inline def `setAdjust-scale`(value: Boolean): Self = StObject.set(x, "adjust-scale", value.asInstanceOf[js.Any])
    
    inline def `setAdjust-scaleUndefined`: Self = StObject.set(x, "adjust-scale", js.undefined)
    
    inline def setAdjustScale(value: Boolean): Self = StObject.set(x, "adjustScale", value.asInstanceOf[js.Any])
    
    inline def setAdjustScaleUndefined: Self = StObject.set(x, "adjustScale", js.undefined)
    
    inline def setCurtain(value: BorderRadiusBottomLeft): Self = StObject.set(x, "curtain", value.asInstanceOf[js.Any])
    
    inline def setCurtainUndefined: Self = StObject.set(x, "curtain", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def `setMax-ticks`(value: Double): Self = StObject.set(x, "max-ticks", value.asInstanceOf[js.Any])
    
    inline def `setMax-ticksUndefined`: Self = StObject.set(x, "max-ticks", js.undefined)
    
    inline def setMaxTicks(value: Double): Self = StObject.set(x, "maxTicks", value.asInstanceOf[js.Any])
    
    inline def setMaxTicksUndefined: Self = StObject.set(x, "maxTicks", js.undefined)
    
    inline def `setReset-timeout`(value: Double): Self = StObject.set(x, "reset-timeout", value.asInstanceOf[js.Any])
    
    inline def `setReset-timeoutUndefined`: Self = StObject.set(x, "reset-timeout", js.undefined)
    
    inline def setResetTimeout(value: Double): Self = StObject.set(x, "resetTimeout", value.asInstanceOf[js.Any])
    
    inline def setResetTimeoutUndefined: Self = StObject.set(x, "resetTimeout", js.undefined)
    
    inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
