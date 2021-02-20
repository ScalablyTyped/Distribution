package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object services {
  
  @JSImport("zetapush-js", "services.Macro")
  @js.native
  class Macro protected () extends Service {
    def this($publish: AsyncMacroServicePublisher) = this()
    
    @JSName("$publish")
    def $publish(method: String): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(
      method: String,
      parameters: js.UndefOr[scala.Nothing],
      hardFail: js.UndefOr[scala.Nothing],
      debug: Double
    ): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: js.UndefOr[scala.Nothing], hardFail: Boolean): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: js.UndefOr[scala.Nothing], hardFail: Boolean, debug: Double): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters, hardFail: js.UndefOr[scala.Nothing], debug: Double): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters, hardFail: Boolean): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters, hardFail: Boolean, debug: Double): js.Promise[_] = js.native
    @JSName("$publish")
    var $publish_Original: AsyncMacroServicePublisher = js.native
  }
  object Macro {
    
    @JSImport("zetapush-js", "services.Macro")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("zetapush-js", "services.Macro.DEFAULT_DEPLOYMENT_ID")
    @js.native
    def DEFAULT_DEPLOYMENT_ID: String = js.native
    @scala.inline
    def DEFAULT_DEPLOYMENT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DEPLOYMENT_ID")(x.asInstanceOf[js.Any])
  }
}
