package typings.zumly

import typings.zumly.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object zumly {
    
    @JSGlobal("zumly")
    @js.native
    open class ^ protected ()
      extends typings.zumly.mod.^ {
      /**
        * Creates a Zumly instance
        * @param options
        * @example
        *  new Zumly({
        *  mount: '.mount',
        *  initialView: 'home',
        *  views: {
        *   home,
        *   contact,
        *   ...
        *  }
        *
        */
      def this(options: Options) = this()
    }
  }
}
