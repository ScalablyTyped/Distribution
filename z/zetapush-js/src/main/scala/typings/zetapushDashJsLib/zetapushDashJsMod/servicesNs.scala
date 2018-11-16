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
    def $publish(method: java.lang.String): stdLib.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String, parameters: js.Any): stdLib.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String, parameters: js.Any, hardFail: scala.Boolean): stdLib.Promise[_] = js.native
    @JSName("$publish")
    def $publish(method: java.lang.String, parameters: js.Any, hardFail: scala.Boolean, debug: scala.Double): stdLib.Promise[_] = js.native
  }
  
  @js.native
  object Macro extends js.Object {
    var DEFAULT_DEPLOYMENT_ID: java.lang.String = js.native
  }
  
}

