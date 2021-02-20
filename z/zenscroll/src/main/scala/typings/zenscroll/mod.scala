package typings.zenscroll

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("zenscroll", JSImport.Namespace)
  @js.native
  val ^ : typings.zenscroll.mod.ZenScroll.zenscroll = js.native
  
  object ZenScroll {
    
    @js.native
    trait setupOption extends StObject {
      
      var defaultDuration: Double = js.native
      
      var edgeOffset: Double = js.native
    }
    object setupOption {
      
      @scala.inline
      def apply(defaultDuration: Double, edgeOffset: Double): setupOption = {
        val __obj = js.Dynamic.literal(defaultDuration = defaultDuration.asInstanceOf[js.Any], edgeOffset = edgeOffset.asInstanceOf[js.Any])
        __obj.asInstanceOf[setupOption]
      }
      
      @scala.inline
      implicit class setupOptionMutableBuilder[Self <: setupOption] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDefaultDuration(value: Double): Self = StObject.set(x, "defaultDuration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEdgeOffset(value: Double): Self = StObject.set(x, "edgeOffset", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait zenscroll extends StObject {
      
      def center(elem: HTMLElement): Unit = js.native
      def center(
        elem: HTMLElement,
        duration: js.UndefOr[scala.Nothing],
        offset: js.UndefOr[scala.Nothing],
        onDone: js.Function0[Unit]
      ): Unit = js.native
      def center(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], offset: Double): Unit = js.native
      def center(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], offset: Double, onDone: js.Function0[Unit]): Unit = js.native
      def center(elem: HTMLElement, duration: Double): Unit = js.native
      def center(elem: HTMLElement, duration: Double, offset: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
      def center(elem: HTMLElement, duration: Double, offset: Double): Unit = js.native
      def center(elem: HTMLElement, duration: Double, offset: Double, onDone: js.Function0[Unit]): Unit = js.native
      
      def createScroller(scrollContainer: HTMLElement): typings.zenscroll.mod.ZenScroll.zenscroll = js.native
      def createScroller(scrollContainer: HTMLElement, defaultDuration: js.UndefOr[scala.Nothing], edgeOffset: Double): typings.zenscroll.mod.ZenScroll.zenscroll = js.native
      def createScroller(scrollContainer: HTMLElement, defaultDuration: Double): typings.zenscroll.mod.ZenScroll.zenscroll = js.native
      def createScroller(scrollContainer: HTMLElement, defaultDuration: Double, edgeOffset: Double): typings.zenscroll.mod.ZenScroll.zenscroll = js.native
      
      def getTopOf(elem: HTMLElement): Double = js.native
      
      def getY(): Double = js.native
      
      def intoView(elem: HTMLElement): Unit = js.native
      def intoView(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
      def intoView(elem: HTMLElement, duration: Double): Unit = js.native
      def intoView(elem: HTMLElement, duration: Double, onDone: js.Function0[Unit]): Unit = js.native
      
      def moving(): Boolean = js.native
      
      def setup(): setupOption = js.native
      def setup(defaultDuration: js.UndefOr[scala.Nothing], edgeOffset: Double): setupOption = js.native
      def setup(defaultDuration: Double): setupOption = js.native
      def setup(defaultDuration: Double, edgeOffset: Double): setupOption = js.native
      
      def stop(): Unit = js.native
      
      def to(elem: HTMLElement): Unit = js.native
      def to(elem: HTMLElement, duration: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
      def to(elem: HTMLElement, duration: Double): Unit = js.native
      def to(elem: HTMLElement, duration: Double, onDone: js.Function0[Unit]): Unit = js.native
      
      def toY(targetY: Double): Unit = js.native
      def toY(targetY: Double, duration: js.UndefOr[scala.Nothing], onDone: js.Function0[Unit]): Unit = js.native
      def toY(targetY: Double, duration: Double): Unit = js.native
      def toY(targetY: Double, duration: Double, onDone: js.Function0[Unit]): Unit = js.native
    }
  }
  
  type _To = typings.zenscroll.mod.ZenScroll.zenscroll
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: typings.zenscroll.mod.ZenScroll.zenscroll = ^
}
