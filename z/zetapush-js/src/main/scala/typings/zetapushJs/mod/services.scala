package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object services {
  
  @JSImport("zetapush-js", "services.Macro")
  @js.native
  class Macro protected ()
    extends StObject
       with Service {
    def this($publish: AsyncMacroServicePublisher) = this()
    
    @JSName("$publish")
    def $publish(method: String): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: Unit, hardFail: Boolean): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: Unit, hardFail: Boolean, debug: Double): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: Unit, hardFail: Unit, debug: Double): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters, hardFail: Boolean): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters, hardFail: Boolean, debug: Double): js.Promise[js.Any] = js.native
    @JSName("$publish")
    def $publish(method: String, parameters: PublishParameters, hardFail: Unit, debug: Double): js.Promise[js.Any] = js.native
    @JSName("$publish")
    var $publish_Original: AsyncMacroServicePublisher = js.native
    
    /* CompleteClass */
    var DEFAULT_DEPLOYMENT_ID: String = js.native
  }
  object Macro {
    
    @JSImport("zetapush-js", "services.Macro")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("zetapush-js", "services.Macro.DEFAULT_DEPLOYMENT_ID")
    @js.native
    def DEFAULT_DEPLOYMENT_ID: String = js.native
    inline def DEFAULT_DEPLOYMENT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DEPLOYMENT_ID")(x.asInstanceOf[js.Any])
  }
}
