package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zetapush-js", "services")
@js.native
object servicesNs extends js.Object {
  @js.native
  class Macro protected ()
    extends zetapushDashJsLib.zetapushDashJsMod.Service {
    def this($publish: zetapushDashJsLib.AsyncMacroServicePublisher) = this()
    @JSName("$publish")
    var $publish_Original: zetapushDashJsLib.AsyncMacroServicePublisher = js.native
    /* CompleteClass */
    override var DEFAULT_DEPLOYMENT_ID: java.lang.String = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String, parameters: js.Any): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String, parameters: js.Any, hardFail: scala.Boolean): js.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String, parameters: js.Any, hardFail: scala.Boolean, debug: scala.Double): js.Promise[_] = js.native
  }
  
  @js.native
  object Macro extends js.Object {
    var DEFAULT_DEPLOYMENT_ID: java.lang.String = js.native
  }
  
}

