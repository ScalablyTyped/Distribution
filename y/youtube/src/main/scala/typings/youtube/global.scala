package typings.youtube

import typings.std.HTMLElement
import typings.youtube.YT.PlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object YT extends js.Object {
    
    @js.native
    class Player protected ()
      extends typings.youtube.YT.Player {
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
