import React, { Component } from 'react';
import { Carousel } from 'react-bootstrap';
import '../styles/toDoList.css';

class CorousalComponent extends Component {

    render() {

        const images = [
            {
                imageUrl: "https://cdn.pixabay.com/photo/2019/07/27/17/56/london-underground-4367265_960_720.jpg",
                imageAlt: "First slide",
                imageHeading: "First slide label",
                imageText: "Nulla vitae elit libero, a pharetra augue mollis interdum."
            },
            {
                imageUrl: "https://cdn.pixabay.com/photo/2019/07/25/20/17/norway-4363362_960_720.jpg",
                imageAlt: "Second slide",
                imageHeading: "Second slide label",
                imageText: "Nulla vitae elit libero, a pharetra augue mollis interdum."
            },
            {
                imageUrl: "https://cdn.pixabay.com/photo/2019/07/14/21/18/germany-4338114_960_720.jpg",
                imageAlt: "Third slide",
                imageHeading: "Third slide label",
                imageText: "Nulla vitae elit libero, a pharetra augue mollis interdum."
            }
        ]
        return (
            <div className="courousal-container">
                <Carousel>
                    {images.map((image, index) => {

                        return (
                        <Carousel.Item>
                        <img
                            className="d-block w-100 courousal-image"
                            src={image.imageUrl}
                            alt={image.imageAlt}
                        />
                        <Carousel.Caption>
                            <h3>{image.imageHeading}</h3>
                            <p>{image.imageText}</p>
                        </Carousel.Caption>
                    </Carousel.Item>
                        );
                    })
                    }
                </Carousel>
            </div>
        )

    }
}

export default CorousalComponent;