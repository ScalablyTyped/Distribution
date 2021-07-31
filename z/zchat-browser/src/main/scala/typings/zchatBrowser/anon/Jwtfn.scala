package typings.zchatBrowser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jwtfn extends StObject {
  
  var jwt_fn: js.UndefOr[js.Function1[/* callback */ js.Function1[/* jwt */ String, Unit], Unit]] = js.undefined
}
object Jwtfn {
  
  @scala.inline
  def apply(): Jwtfn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwtfn]
  }
  
  @scala.inline
  implicit class JwtfnMutableBuilder[Self <: Jwtfn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJwt_fn(value: /* callback */ js.Function1[/* jwt */ String, Unit] => Unit): Self = StObject.set(x, "jwt_fn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJwt_fnUndefined: Self = StObject.set(x, "jwt_fn", js.undefined)
  }
}
