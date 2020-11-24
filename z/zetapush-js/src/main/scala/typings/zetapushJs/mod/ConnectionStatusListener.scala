package typings.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStatusListener extends js.Object {
  
  def onConnectionBroken(): Unit = js.native
  
  def onConnectionClosed(): Unit = js.native
  
  def onConnectionEstablished(): Unit = js.native
  
  def onConnectionToServerFail(failure: js.Any): Unit = js.native
  
  def onConnectionWillClose(): Unit = js.native
  
  def onFailedHandshake(failure: js.Any): Unit = js.native
  
  def onMessageLost(): Unit = js.native
  
  def onNegotiationFailed(failure: js.Any): Unit = js.native
  
  def onNoServerUrlAvailable(): Unit = js.native
  
  def onSuccessfulHandshake(authentication: js.Any): Unit = js.native
}
object ConnectionStatusListener {
  
  @scala.inline
  def apply(
    onConnectionBroken: () => Unit,
    onConnectionClosed: () => Unit,
    onConnectionEstablished: () => Unit,
    onConnectionToServerFail: js.Any => Unit,
    onConnectionWillClose: () => Unit,
    onFailedHandshake: js.Any => Unit,
    onMessageLost: () => Unit,
    onNegotiationFailed: js.Any => Unit,
    onNoServerUrlAvailable: () => Unit,
    onSuccessfulHandshake: js.Any => Unit
  ): ConnectionStatusListener = {
    val __obj = js.Dynamic.literal(onConnectionBroken = js.Any.fromFunction0(onConnectionBroken), onConnectionClosed = js.Any.fromFunction0(onConnectionClosed), onConnectionEstablished = js.Any.fromFunction0(onConnectionEstablished), onConnectionToServerFail = js.Any.fromFunction1(onConnectionToServerFail), onConnectionWillClose = js.Any.fromFunction0(onConnectionWillClose), onFailedHandshake = js.Any.fromFunction1(onFailedHandshake), onMessageLost = js.Any.fromFunction0(onMessageLost), onNegotiationFailed = js.Any.fromFunction1(onNegotiationFailed), onNoServerUrlAvailable = js.Any.fromFunction0(onNoServerUrlAvailable), onSuccessfulHandshake = js.Any.fromFunction1(onSuccessfulHandshake))
    __obj.asInstanceOf[ConnectionStatusListener]
  }
  
  @scala.inline
  implicit class ConnectionStatusListenerOps[Self <: ConnectionStatusListener] (val x: Self) extends AnyVal {
    
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
    def setOnConnectionBroken(value: () => Unit): Self = this.set("onConnectionBroken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnConnectionClosed(value: () => Unit): Self = this.set("onConnectionClosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnConnectionEstablished(value: () => Unit): Self = this.set("onConnectionEstablished", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnConnectionToServerFail(value: js.Any => Unit): Self = this.set("onConnectionToServerFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnConnectionWillClose(value: () => Unit): Self = this.set("onConnectionWillClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFailedHandshake(value: js.Any => Unit): Self = this.set("onFailedHandshake", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMessageLost(value: () => Unit): Self = this.set("onMessageLost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNegotiationFailed(value: js.Any => Unit): Self = this.set("onNegotiationFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnNoServerUrlAvailable(value: () => Unit): Self = this.set("onNoServerUrlAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccessfulHandshake(value: js.Any => Unit): Self = this.set("onSuccessfulHandshake", js.Any.fromFunction1(value))
  }
}
