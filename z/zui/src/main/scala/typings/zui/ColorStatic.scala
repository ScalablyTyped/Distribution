package typings.zui

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStatic
  extends StObject
     with Instantiable0[Color]
     with Instantiable1[/* hexStrOrrgbColorOrRgbaColorOrName */ String, Color]
     with Instantiable3[/* r */ Double, /* g */ Double, /* b */ Double, Color]
     with Instantiable4[/* r */ Double, /* g */ Double, /* b */ Double, /* a */ Double, Color] {
  
  def isColor(str: String): Boolean = js.native
  
  var names: js.Array[String] = js.native
}
