package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MyGdxGame extends ApplicationAdapter {


   class MyActor extends Actor {
      Texture texture = new Texture(Gdx.files.internal("badlogic.jpg"));

      @Override
      public void draw(Batch batch, float parentAlpha) {
         batch.draw(texture,0,0);
      }
   }
   Stage stage;
   @Override
   public void create () {
      stage = new Stage(new ScreenViewport());
      MyActor actor = new MyActor();
      stage.addActor(actor);
      Gdx.input.setInputProcessor(stage);
   }

   @Override
   public void render () {
      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
      stage.draw();
   }
}
