package typings.zwjsbridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TicketId extends StObject {
  
  var ticketId: js.UndefOr[String] = js.undefined
}
object TicketId {
  
  inline def apply(): TicketId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TicketId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TicketId] (val x: Self) extends AnyVal {
    
    inline def setTicketId(value: String): Self = StObject.set(x, "ticketId", value.asInstanceOf[js.Any])
    
    inline def setTicketIdUndefined: Self = StObject.set(x, "ticketId", js.undefined)
  }
}
