package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface of the `zone.js` runtime configurations.
  *
  * These configurations can be defined on the `Zone` object after
  * importing zone.js to change behaviors. The differences between
  * the `ZoneRuntimeConfigurations` and the `ZoneGlobalConfigurations` are,
  *
  * 1. `ZoneGlobalConfigurations` must be defined on the `global/window` object before importing
  * `zone.js`. The value of the configuration cannot be changed at runtime.
  *
  * 2. `ZoneRuntimeConfigurations` must be defined on the `Zone` object after importing `zone.js`.
  * You can change the value of this configuration at runtime.
  *
  */
@js.native
trait ZoneRuntimeConfigurations extends StObject {
  
  /**
    * Ignore outputting errors to the console when uncaught Promise errors occur.
    *
    * By default, if an uncaught Promise error occurs, `zone.js` outputs the
    * error to the console by calling `console.error()`.
    *
    * If you set `__zone_symbol__ignoreConsoleErrorUncaughtError = true`, `zone.js` does not output
    * the uncaught error to `console.error()`.
    */
  var __zone_symbol__ignoreConsoleErrorUncaughtError: js.UndefOr[Boolean] = js.native
}
object ZoneRuntimeConfigurations {
  
  @scala.inline
  def apply(): ZoneRuntimeConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneRuntimeConfigurations]
  }
  
  @scala.inline
  implicit class ZoneRuntimeConfigurationsMutableBuilder[Self <: ZoneRuntimeConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__zone_symbol__ignoreConsoleErrorUncaughtError(value: Boolean): Self = StObject.set(x, "__zone_symbol__ignoreConsoleErrorUncaughtError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__zone_symbol__ignoreConsoleErrorUncaughtErrorUndefined: Self = StObject.set(x, "__zone_symbol__ignoreConsoleErrorUncaughtError", js.undefined)
  }
}
