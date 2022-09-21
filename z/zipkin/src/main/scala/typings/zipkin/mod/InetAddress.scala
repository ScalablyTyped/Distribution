package typings.zipkin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("zipkin", "InetAddress")
@js.native
open class InetAddress protected () extends StObject {
  def this(addr: String) = this()
  
  def ipv4(): String = js.native
  
  def toInt(): Double = js.native
}
object InetAddress {
  
  @JSImport("zipkin", "InetAddress")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getLocalAddress(): InetAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalAddress")().asInstanceOf[InetAddress]
}
