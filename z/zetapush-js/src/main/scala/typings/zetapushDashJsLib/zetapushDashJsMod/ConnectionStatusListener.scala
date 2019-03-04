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

object ConnectionStatusListener {
  @scala.inline
  def apply(
    onConnectionBroken: js.Function0[scala.Unit],
    onConnectionClosed: js.Function0[scala.Unit],
    onConnectionEstablished: js.Function0[scala.Unit],
    onConnectionToServerFail: js.Function1[js.Any, scala.Unit],
    onConnectionWillClose: js.Function0[scala.Unit],
    onFailedHandshake: js.Function1[js.Any, scala.Unit],
    onMessageLost: js.Function0[scala.Unit],
    onNegotiationFailed: js.Function1[js.Any, scala.Unit],
    onNoServerUrlAvailable: js.Function0[scala.Unit],
    onSuccessfulHandshake: js.Function1[js.Any, scala.Unit]
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal(onConnectionBroken = onConnectionBroken, onConnectionClosed = onConnectionClosed, onConnectionEstablished = onConnectionEstablished, onConnectionToServerFail = onConnectionToServerFail, onConnectionWillClose = onConnectionWillClose, onFailedHandshake = onFailedHandshake, onMessageLost = onMessageLost, onNegotiationFailed = onNegotiationFailed, onNoServerUrlAvailable = onNoServerUrlAvailable, onSuccessfulHandshake = onSuccessfulHandshake)
  
    __obj.asInstanceOf[ConnectionStatusListener]
  }
}

