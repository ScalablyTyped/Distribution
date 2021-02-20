package typings.zumly

import typings.std.Element
import typings.std.Record
import typings.zumly.anon.Cover
import typings.zumly.anon.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zumly", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends typings.zumly.mod.zumly {
    /**
      * Creates a Zumly instance
      * @params options
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
  
  @js.native
  trait Options extends StObject {
    
    // Activate debug notifications
    var debug: js.UndefOr[Boolean] = js.native
    
    // First rendered view name
    var initialView: String = js.native
    
    // Mount DOM Element
    var mount: String = js.native
    
    // Custom transitions
    var transitions: js.UndefOr[Cover] = js.native
    
    // Store of all view objects
    var views: Record[String, WithRender | String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(initialView: String, mount: String, views: Record[String, WithRender | String]): Options = {
      val __obj = js.Dynamic.literal(initialView = initialView.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setInitialView(value: String): Self = StObject.set(x, "initialView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMount(value: String): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitions(value: Cover): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setViews(value: Record[String, WithRender | String]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
  
  type WithRender = (Record[String, _]) with Render
  
  @js.native
  trait zumly extends StObject {
    
    def init(): js.Promise[Unit] = js.native
    
    def zoomIn(el: Element): js.Promise[Unit] = js.native
    
    def zoomLevel(): Double = js.native
    
    def zoomOut(): Unit = js.native
  }
  object zumly {
    
    @scala.inline
    def apply(
      init: () => js.Promise[Unit],
      zoomIn: Element => js.Promise[Unit],
      zoomLevel: () => Double,
      zoomOut: () => Unit
    ): typings.zumly.mod.zumly = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), zoomIn = js.Any.fromFunction1(zoomIn), zoomLevel = js.Any.fromFunction0(zoomLevel), zoomOut = js.Any.fromFunction0(zoomOut))
      __obj.asInstanceOf[typings.zumly.mod.zumly]
    }
    
    @scala.inline
    implicit class zumlyMutableBuilder[Self <: typings.zumly.mod.zumly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInit(value: () => js.Promise[Unit]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomIn(value: Element => js.Promise[Unit]): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomLevel(value: () => Double): Self = StObject.set(x, "zoomLevel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setZoomOut(value: () => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
    }
  }
}
