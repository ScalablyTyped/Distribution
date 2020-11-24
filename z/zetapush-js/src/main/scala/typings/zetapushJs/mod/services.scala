package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zetapush-js", "services")
@js.native
object services extends js.Object {
  
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
  /* static members */
  @js.native
  object Macro extends js.Object {
    
    var DEFAULT_DEPLOYMENT_ID: String = js.native
  }
}
