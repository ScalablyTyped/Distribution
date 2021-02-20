package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "InetAddress")
@js.native
class InetAddress protected () extends StObject {
  def this(addr: String) = this()
  
  def ipv4(): String = js.native
  
  def toInt(): Double = js.native
}
object InetAddress {
  
  /* static member */
  @JSImport("zipkin", "InetAddress.getLocalAddress")
  @js.native
  def getLocalAddress(): InetAddress = js.native
}
