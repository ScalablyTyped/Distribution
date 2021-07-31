package typings.youtube

import typings.std.HTMLElement
import typings.youtube.YT.PlayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object YT {
    
    @JSGlobal("YT.Player")
    @js.native
    class Player protected ()
      extends StObject
         with typings.youtube.YT.Player {
      /**
        * Initializes a new instance of the Player class.
        *
        * @param container   DOM element to insert the player's <iframe>.
        * @param options   Player options.
        */
      def this(elt: HTMLElement, options: PlayerOptions) = this()
      /**
        * Initializes a new instance of the Player class.
        *
        * @param id   ID of the DOM element to insert the player's <iframe>.
        * @param options   Player options.
        */
      def this(id: String, options: PlayerOptions) = this()
    }
  }
}
