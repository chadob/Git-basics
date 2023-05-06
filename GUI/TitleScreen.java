public class TitleScreen implements GameButton {

	private GameButton startButton;
	private GameButton aboutButton;
	private GameButton loadButton;
	private GameButton quitButton;
	private String background;
	private String[] styles;

	public GameButton getStartButton() {
 		return this.startButton; 
	}

	public void setStartButton(GameButton startButton) {
 		this.startButton = startButton; 
	}

	public GameButton getAboutButton() {
 		return this.aboutButton; 
	}

	public void setAboutButton(GameButton aboutButton) {
 		this.aboutButton = aboutButton; 
	}

	public GameButton getLoadButton() {
 		return this.loadButton; 
	}

	public void setLoadButton(GameButton loadButton) {
 		this.loadButton = loadButton; 
	}

	public GameButton getQuitButton() {
 		return this.quitButton; 
	}

	public void setQuitButton(GameButton quitButton) {
 		this.quitButton = quitButton; 
	}

	public String getBackground() {
 		return this.background; 
	}

	public void setBackground(String background) {
 		this.background = background; 
	}

	public String[] getStyles() {
 		return this.styles; 
	}

	public void setStyles(String[] styles) {
 		this.styles = styles; 
	}

}
