package typings.zoneJs

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
trait ZoneRuntimeConfigurations extends js.Object {
  
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
  implicit class ZoneRuntimeConfigurationsOps[Self <: ZoneRuntimeConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__zone_symbol__ignoreConsoleErrorUncaughtError(value: Boolean): Self = this.set("__zone_symbol__ignoreConsoleErrorUncaughtError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__zone_symbol__ignoreConsoleErrorUncaughtError: Self = this.set("__zone_symbol__ignoreConsoleErrorUncaughtError", js.undefined)
  }
}
