package com.jcalzado.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PrimerGdx extends ApplicationAdapter {

	private Texture tux;
	private SpriteBatch batch;
	
	@Override
	public void create () {
		tux = new Texture("tux.png");
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		// Limpiamos el buffer de la gráfica.
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		// Empezamos a "dibujar cosas".
		batch.begin();
		// Dibujamos a Tux en la esquina superior iquierda.
		batch.draw(tux, 0, Gdx.graphics.getHeight()-tux.getHeight());
		// Dibujamos a Tux en la esquina superior derecha.
		batch.draw(tux, Gdx.graphics.getWidth()-tux.getWidth(), Gdx.graphics.getHeight()-tux.getHeight());
		// Dibujamos a Tux en la esquina inferior iquierda.
		batch.draw(tux, 0, 0);
		// Dibujamos a Tux en la esquina inferior derecha.
		batch.draw(tux, Gdx.graphics.getWidth()-tux.getWidth(), 0);
		// Dibujamos a Tux en (200,200) con un tamaño de 250x250 píxeles.
		batch.draw(tux, 200, 200, 250, 250);
		// Fijamos el color de fondo.
		Gdx.gl.glClearColor(0.6f, 0.6f, 1.0f, 1);
		// Terminamos de "dibujar cosas".
		batch.end();
	}
	
	@Override
	public void dispose () {
		tux.dispose();
		batch.dispose();
	}
}
