package typings
package zetapushDashJsLib.zetapushDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStatusListener extends js.Object {
  def onConnectionBroken(): scala.Unit
  def onConnectionClosed(): scala.Unit
  def onConnectionEstablished(): scala.Unit
  def onConnectionToServerFail(failure: js.Any): scala.Unit
  def onConnectionWillClose(): scala.Unit
  def onFailedHandshake(failure: js.Any): scala.Unit
  def onMessageLost(): scala.Unit
  def onNegotiationFailed(failure: js.Any): scala.Unit
  def onNoServerUrlAvailable(): scala.Unit
  def onSuccessfulHandshake(authentication: js.Any): scala.Unit
}

