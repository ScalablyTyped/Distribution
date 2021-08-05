package typings.zetapushJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStatusListener extends StObject {
  
  def onConnectionBroken(): Unit
  
  def onConnectionClosed(): Unit
  
  def onConnectionEstablished(): Unit
  
  def onConnectionToServerFail(failure: js.Any): Unit
  
  def onConnectionWillClose(): Unit
  
  def onFailedHandshake(failure: js.Any): Unit
  
  def onMessageLost(): Unit
  
  def onNegotiationFailed(failure: js.Any): Unit
  
  def onNoServerUrlAvailable(): Unit
  
  def onSuccessfulHandshake(authentication: js.Any): Unit
}
object ConnectionStatusListener {
  
  inline def apply(
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
  
  extension [Self <: ConnectionStatusListener](x: Self) {
    
    inline def setOnConnectionBroken(value: () => Unit): Self = StObject.set(x, "onConnectionBroken", js.Any.fromFunction0(value))
    
    inline def setOnConnectionClosed(value: () => Unit): Self = StObject.set(x, "onConnectionClosed", js.Any.fromFunction0(value))
    
    inline def setOnConnectionEstablished(value: () => Unit): Self = StObject.set(x, "onConnectionEstablished", js.Any.fromFunction0(value))
    
    inline def setOnConnectionToServerFail(value: js.Any => Unit): Self = StObject.set(x, "onConnectionToServerFail", js.Any.fromFunction1(value))
    
    inline def setOnConnectionWillClose(value: () => Unit): Self = StObject.set(x, "onConnectionWillClose", js.Any.fromFunction0(value))
    
    inline def setOnFailedHandshake(value: js.Any => Unit): Self = StObject.set(x, "onFailedHandshake", js.Any.fromFunction1(value))
    
    inline def setOnMessageLost(value: () => Unit): Self = StObject.set(x, "onMessageLost", js.Any.fromFunction0(value))
    
    inline def setOnNegotiationFailed(value: js.Any => Unit): Self = StObject.set(x, "onNegotiationFailed", js.Any.fromFunction1(value))
    
    inline def setOnNoServerUrlAvailable(value: () => Unit): Self = StObject.set(x, "onNoServerUrlAvailable", js.Any.fromFunction0(value))
    
    inline def setOnSuccessfulHandshake(value: js.Any => Unit): Self = StObject.set(x, "onSuccessfulHandshake", js.Any.fromFunction1(value))
  }
}
